package date.xfans.app.hacknews_kotlin.date.source

import date.xfans.app.hacknews_kotlin.date.Post

/**
 * Created by Sanket Selokar on 2017/6/24.
 */
interface DataSource{
    fun getStories(callback : ResultCallBack<Post>)
}