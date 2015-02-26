package org.gittner.osmbugs.platforms;

import android.content.Context;

import org.gittner.osmbugs.loader.LoaderManager;

public class Platforms
{
    public static AllPlatforms ALL_PLATFORMS;

    public static Keepright KEEPRIGHT;
    public static Osmose OSMOSE;
    public static Mapdust MAPDUST;
    public static OsmNotes OSM_NOTES;

    public static LoaderManager LOADER_MANAGER;


    public static void init(Context context)
    {
        ALL_PLATFORMS = AllPlatforms_.getInstance_(context);

        KEEPRIGHT = Keepright_.getInstance_(context);
        OSMOSE = Osmose_.getInstance_(context);
        MAPDUST = Mapdust_.getInstance_(context);
        OSM_NOTES = OsmNotes_.getInstance_(context);

        ALL_PLATFORMS.addAll(new Platform[]{
                KEEPRIGHT,
                OSMOSE,
                MAPDUST,
                OSM_NOTES
        });

        LOADER_MANAGER = LoaderManager.getInstance();

        LOADER_MANAGER.addLoader(KEEPRIGHT.getLoader());
        LOADER_MANAGER.addLoader(OSMOSE.getLoader());
        LOADER_MANAGER.addLoader(MAPDUST.getLoader());
        LOADER_MANAGER.addLoader(OSM_NOTES.getLoader());
    }


    public static Platform byName(String name)
    {
        return ALL_PLATFORMS.byName(name);
    }
}
