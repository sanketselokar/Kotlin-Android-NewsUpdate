package date.xfans.app.hacknews_kotlin.view.main.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import date.xfans.app.hacknews_kotlin.R
import date.xfans.app.hacknews_kotlin.base.toast
import date.xfans.app.hacknews_kotlin.date.Post
import kotlinx.android.synthetic.main.item_main.*
import kotlinx.android.synthetic.main.item_main.view.*
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*



/**
 * Created by Sanket Selokar on 2016/6/22.
 */
class MainAdapter( lists:List<Post>, var itemClick : (Post) -> Unit): RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    var mLists: List<Post>

    init {
        mLists = lists
    }

    override fun getItemCount() = mLists.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder? {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = mLists[position]

        holder.itemView.title.text = post.by

        val formatter = SimpleDateFormat("dd/MM/yyyy hh:mm:ss.SSS")
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = post.time

        holder.itemView.date.text = formatter.format(calendar.getTime())

        holder.itemView.content.text = post.title


        holder.itemView.setOnClickListener {
            itemClick(post)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}

