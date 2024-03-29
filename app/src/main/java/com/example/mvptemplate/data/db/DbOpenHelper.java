package com.example.mvptemplate.data.db;


import android.content.Context;

import com.example.mvptemplate.data.db.model.DaoMaster;
import com.example.mvptemplate.di.ApplicationContext;
import com.example.mvptemplate.di.DatabaseInfo;

import org.greenrobot.greendao.database.Database;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DbOpenHelper extends DaoMaster.OpenHelper {

    @Inject
    public DbOpenHelper(@ApplicationContext Context context, @DatabaseInfo String name) {
        super(context,name);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
        switch (oldVersion) {
            case 1:
            case 2: // 在这里对数据库的表格进行修改
        }
    }

}
