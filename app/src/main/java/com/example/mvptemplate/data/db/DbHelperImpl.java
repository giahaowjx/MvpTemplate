package com.example.mvptemplate.data.db;

import com.example.mvptemplate.data.db.model.DaoMaster;
import com.example.mvptemplate.data.db.model.DaoSession;

import java.util.Observable;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DbHelperImpl implements DbHelper {

    private DaoSession mDaoSession;

    @Inject
    public DbHelperImpl(DbOpenHelper dbOpenHelper) {
        mDaoSession = new DaoMaster(dbOpenHelper.getWritableDb()).newSession();
    }

}
