package org.mcsg.double0negative.tabapi;

import com.comphenix.protocol.wrappers.WrappedGameProfile;
import org.bukkit.plugin.Plugin;

/**
 *
 * @author NeT32
 */
class TabHolder47 {

    Plugin p;
    String[][] tabs;
    int[][] tabPings;
    WrappedGameProfile[][] tabGameProfiles;
    int maxh = 0, maxv = 0;

    public TabHolder47(Plugin p)
    {
        this.p = p;
        this.tabs = new String[TabAPI.getHorizSize(47)][TabAPI.getVertSize(47)];
        this.tabPings = new int[TabAPI.getHorizSize(47)][TabAPI.getVertSize(47)];
        this.tabGameProfiles = new WrappedGameProfile[TabAPI.getHorizSize(47)][TabAPI.getVertSize(47)];
        this.maxh = TabAPI.getHorizSize(47);
        this.maxv = TabAPI.getVertSize(47);
        for (int b = 0; b < this.maxv; b++)
        {
            for (int a = 0; a < this.maxh; a++)
            {
                this.tabs[a][b] = " ";
                this.tabPings[a][b] = 9999;
                this.tabGameProfiles[a][b] = null;
            }
        }
    }

    public TabHolder47 getCopy()
    {
        TabHolder47 newCopy = new TabHolder47(p);
        newCopy.tabs = copyStringArray(tabs);
        newCopy.tabPings = copyIntArray(tabPings);
        return newCopy;
    }

    /* Util method, copy tab array to new array */
    private static String[][] copyStringArray(String[][] tab)
    {
        int horzTabSize = TabAPI.getHorizSize(47);
        int vertTabSize = TabAPI.getVertSize(47);
        String[][] temp = new String[horzTabSize][vertTabSize];
        for (int b = 0; b < vertTabSize; b++)
        {
            for (int a = 0; a < horzTabSize; a++)
            {
                temp[a][b] = tab[a][b];
            }
        }
        return temp;
    }

    private static int[][] copyIntArray(int[][] tab)
    {
        int horzTabSize = TabAPI.getHorizSize(47);
        int vertTabSize = TabAPI.getVertSize(47);
        int[][] temp = new int[horzTabSize][vertTabSize];
        for (int b = 0; b < vertTabSize; b++)
        {
            for (int a = 0; a < horzTabSize; a++)
            {
                temp[a][b] = tab[a][b];
            }
        }
        return temp;
    }
}
