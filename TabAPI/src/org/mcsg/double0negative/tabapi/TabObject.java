package org.mcsg.double0negative.tabapi;

import java.util.HashMap;

import org.bukkit.plugin.Plugin;

public class TabObject{


	/**
	 * Holds a list of tab information for a player.
	 * 
	 * 
	 */
	
	
	HashMap<Integer, TabHolder>tabs = new HashMap<Integer, TabHolder>();

	
	

	public void setPriority(Plugin p, int pri){
		//System.out.println("Settings pri for "+p.getName()+": "+pri);
		for(int a = -1; a<4;a++){
			if(tabs.get(a) != null && tabs.get(a).p == p){
				tabs.put(a, null);
			}
		}
		if(pri > -2){
			TabHolder t = new TabHolder();
			t.tabs = new String[3][20];
			t.p = p;
			tabs.put(pri,t );
		}
	}

	public TabHolder getTab(){
		int a = 3;
		while(tabs.get(a) == null && a >-3){
			a--;
		}
		if(a == -2){
			TabHolder  t = new TabHolder();
			t.tabs = new String[3][20];
			return t;
		}
		//System.out.print("Getting tab "+a+" "+tabs.get(a).p.getName());
		return tabs.get(a);
	}

	public void setTab(Plugin plugin, int x, int y, String msg, int ping) {
		int a = -1;
		while((tabs.get(a)==null || tabs.get(a).p != plugin) && a <3){
			a++;
		}
		if(a == 3 && (tabs.get(a)==null||tabs.get(a).p != plugin)){
			//System.out.println("Reseting Pri");
			setPriority(plugin, 0);
			a = 0;
		}
		//System.out.println(plugin.getName()+": "+a);

		TabHolder t = tabs.get(a);

		t.tabs[y][x] = msg;
		t.tabPings[y][x] = ping;
		t.maxh = 3;
		t.maxv = Math.max(x+1, t.maxv);
	}

}
