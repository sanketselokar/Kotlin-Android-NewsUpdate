package date.xfans.app.hacknews_kotlin.view.main.contract

import date.xfans.app.hacknews_kotlin.base.BasePresenter
import date.xfans.app.hacknews_kotlin.base.BaseView
import date.xfans.app.hacknews_kotlin.date.Post

/**
 * Created by Sanket Selokar on 2017/6/24.
 */
interface MainContract{
    interface View: BaseView<Presenter>{
        fun addItem(post: Post)
        fun showTaskDetailsUi(title: String, url: String)
        fun showLoading(flag: Boolean)
        fun clearList()
    }
    interface Presenter: BasePresenter{
        fun openDetails(it: Post)
        fun getStories(isRefresh: Boolean)

    }
}