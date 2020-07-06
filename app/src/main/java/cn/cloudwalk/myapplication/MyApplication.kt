package cn.cloudwalk.myapplication

import android.app.Application
import com.didichuxing.doraemonkit.DoraemonKit

/**
 * ClassName: MyApplication<br/>
 * Description: TODO Description. <br/>
 * date: 2020/7/3 14:57<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DoraemonKit.install(this)
    }
}