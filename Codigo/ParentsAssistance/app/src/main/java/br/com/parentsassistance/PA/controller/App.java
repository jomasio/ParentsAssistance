package br.com.parentsassistance.PA.controller;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.app.Activity;


/**
 * Created by Robinson on 16/12/2015.
 */
public class App extends Application{




        private static Context mContext;

        @Override
        public void onCreate() {
            super.onCreate();
            mContext = this;


        }

        public static Context getContext() {
            return mContext;
        }
    }


