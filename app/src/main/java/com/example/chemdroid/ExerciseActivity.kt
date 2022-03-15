package com.example.chemdroid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_exercise.*
import kotlinx.android.synthetic.main.activity_study.*

class ExerciseActivity : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener{


    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navigationView: NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aaa2)

        toolbar = findViewById(R.id.toolbar)

        supportActionBar?.hide()
        drawerLayout = findViewById(R.id.DrawerLayout)
        navigationView = findViewById(R.id.nav_view)


        val Toggle = ActionBarDrawerToggle(
                this, drawerLayout, toolbar, 0, 0
        )
        drawerLayout.addDrawerListener(Toggle)
        Toggle.syncState()
        navigationView.setNavigationItemSelectedListener(this)

        val fragment = supportFragmentManager.beginTransaction()


        E1.setOnClickListener {
            startActivity(Intent(this, E1Activity::class.java))
        }

        E2.setOnClickListener {
            startActivity(Intent(this, E2Activity::class.java))
        }

        E3.setOnClickListener {
            startActivity(Intent(this, E3Activity::class.java))
        }

        E4.setOnClickListener {
            startActivity(Intent(this, E4Activity::class.java))
        }

        E5.setOnClickListener {
            startActivity(Intent(this, E5Activity::class.java))
        }

        E6.setOnClickListener {
            startActivity(Intent(this, E6Activity::class.java))
        }

        E7.setOnClickListener {
            startActivity(Intent(this, E7Activity::class.java))
        }

        E8.setOnClickListener {
            startActivity(Intent(this, E8Activity::class.java))
        }

        E9.setOnClickListener {
            startActivity(Intent(this, E9Activity::class.java))
        }

        E10.setOnClickListener {
            startActivity(Intent(this, E10Activity::class.java))
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        drawerLayout.closeDrawer(GravityCompat.START)

        when (item.itemId) {
            R.id.Dashboard -> {
                changeFragment(aHome())


            }


            R.id.Appversion -> {
                Toast.makeText(applicationContext, "Version 1.0", Toast.LENGTH_SHORT).show()

            }

            R.id.Help -> {

                val builder = AlertDialog.Builder(this)
                builder.setTitle("Help")
                builder.setMessage(R.string.alert1)
                builder.setPositiveButton("Ok", null)

                val width = (resources.displayMetrics.widthPixels * 0.90).toInt()
                val height = (resources.displayMetrics.heightPixels * 0.90).toInt()

                val dialog: AlertDialog = builder.create()
                dialog.show()
                dialog.getWindow()?.setLayout(width, height)

            }
            R.id.Privacy -> {
                val openURL = Intent(Intent.ACTION_VIEW)
                openURL.data = Uri.parse("http://ocedu.io/privacy.html")
                startActivity(openURL)
            }
        }

        return true
    }

    fun setToolbarTitle(title: String){
        supportActionBar?.title = title

    }
    fun changeFragment(frag: Fragment){
        val fragment = supportFragmentManager.beginTransaction()
        fragment.replace(R.id.fragment_container, frag).commit()


    }
    }
