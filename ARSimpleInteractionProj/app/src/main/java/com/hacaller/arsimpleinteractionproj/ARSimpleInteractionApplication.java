package com.hacaller.arsimpleinteractionproj;

import android.app.Application;

import org.artoolkit.ar.base.assets.AssetHelper;

/**
 * Created by Herbert Caller on 28/11/2017.
 */

public class ARSimpleInteractionApplication extends Application {

    private static Application sInstance;

    // Anywhere in the application where an instance is required, this method
    // can be used to retrieve it.
    public static Application getInstance() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        ((ARSimpleInteractionApplication) sInstance).initializeInstance();
    }

    // Here we do one-off initialisation which should apply to all activities
    // in the application.
    protected void initializeInstance() {

        // Unpack assets to cache directory so native library can read them.
        // N.B.: If contents of assets folder changes, be sure to increment the
        // versionCode integer in the AndroidManifest.xml file.
        AssetHelper assetHelper = new AssetHelper(getAssets());
        assetHelper.cacheAssetFolder(getInstance(), "Data");
    }


}
