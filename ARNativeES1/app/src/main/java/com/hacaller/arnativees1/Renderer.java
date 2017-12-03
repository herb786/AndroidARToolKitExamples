package com.hacaller.arnativees1;

import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Herbert Caller on 02/12/2017.
 */

public class Renderer implements GLSurfaceView.Renderer {

    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        MainActivity.nativeSurfaceCreated();
    }

    public void onSurfaceChanged(GL10 gl, int w, int h) {
        MainActivity.nativeSurfaceChanged(w, h);
    }

    public void onDrawFrame(GL10 gl) {
        MainActivity.nativeDrawFrame();
    }

}