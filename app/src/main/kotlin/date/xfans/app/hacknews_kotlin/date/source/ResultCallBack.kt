package date.xfans.app.hacknews_kotlin.date.source

/**
 * Created by Sanket Selokar on 2017/6/24.
 */
interface ResultCallBack<T>{
    fun after()
    fun onResponse(response: T?)
    fun onError(message: String)
}