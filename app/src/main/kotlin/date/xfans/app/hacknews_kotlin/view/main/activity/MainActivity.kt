package date.xfans.app.hacknews_kotlin.view.main.activity

import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import date.xfans.app.hacknews_kotlin.R
import date.xfans.app.hacknews_kotlin.base.addFragmentToActivity
import date.xfans.app.hacknews_kotlin.base.openBrowser
import date.xfans.app.hacknews_kotlin.view.main.fragment.MainFragment
import date.xfans.app.hacknews_kotlin.view.main.presenter.MainPresenter

class MainActivity : AppCompatActivity(){

//    private val toolBar = findViewById(R.id.toolBar) as Toolbar
//    private val drawerLayout = findViewById(R.id.drawer_layout) as DrawerLayout
//    private val drawerToggle: ActionBarDrawerToggle by lazy {
//        ActionBarDrawerToggle(this, drawerLayout, toolBar,
//                R.string.drawer_open, R.string.drawer_close)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolBar = findViewById(R.id.toolBar) as Toolbar

        setSupportActionBar(toolBar)
        supportActionBar?.title = getString(R.string.drawer_home)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var mainFragment1: MainFragment? = supportFragmentManager.findFragmentById(R.id.container) as MainFragment?
        if (mainFragment1 == null) {
            mainFragment1 = MainFragment.newInstance()
            addFragmentToActivity(mainFragment1,R.id.container)
        }
        MainPresenter(mainFragment1)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//                R.id.action_github -> {
//  //                  openBrowser("https://github.com/xfans/HackerNews_Kotlin")
//                return true
//            }
//        }
//        return super.onOptionsItemSelected(item)
//    }

//    override fun onPostCreate(savedInstanceState: Bundle?) {
//        super.onPostCreate(savedInstanceState)
//        drawerLayout.setDrawerListener(drawerToggle)
//        drawerToggle.syncState()
//    }
//
//    override fun onConfigurationChanged(newConfig: Configuration?) {
//        super.onConfigurationChanged(newConfig)
//        drawerToggle.onConfigurationChanged(newConfig)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
//        if (drawerToggle.onOptionsItemSelected(item))
//            return true
//        else
//            return super.onOptionsItemSelected(item)
//    }

}
