package com.example.rssreader;

import android.content.Context;
import android.util.Log;

import com.example.rssreader.db.FeedItemEntity;
import com.example.rssreader.db.FeedItemOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nanao on 9/23/15.
 * フィードの取得結果を保存したり読み出したりするクラス
 */
public class FeedCache {
    private Context context;

    public FeedCache(Context context) {
        this.context = context;
    }

    /*
    * キャッシュファイルが存在すれば、キャッシュがあるという判断をするメソッド
    * */
    public boolean exists() {
        FeedItemOpenHelper openHelper = new FeedItemOpenHelper(context);

        // TODO:DBのレコード数をカウントして、キャッシュがあるかどうかを判定しましょう
        boolean result = false;

        openHelper.close();
        return result;
    }

    public List<FeedItemEntity> read() {
        FeedItemOpenHelper openHelper = new FeedItemOpenHelper(context);

        // TODO:DBのレコード数を取得してresultに代入してみましょう
        List<FeedItemEntity> result = new ArrayList<FeedItemEntity>();

        openHelper.close();
        return result;
    }

    public void write(String feedString) {
        FeedItemOpenHelper openHelper = new FeedItemOpenHelper(context);

        // TODO: 念のため、既存のキャッシュを全て削除しましょう

        // TODO: feedStringをListに変換しましょう
        
        // TODO: feedStringをlistに変換したものをDBに保存しましょう

        boolean result = false;
        if (!result) {
           Log.e("FeedCache.write", "failed to write cache!");
        }
        openHelper.close();
    }
}
