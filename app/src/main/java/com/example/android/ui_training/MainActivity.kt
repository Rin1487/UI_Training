package com.example.android.ui_training

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import com.example.android.ui_training.adapter.PagerAdapter
import com.example.android.ui_training.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    private fun initial() {
        binding.viewPager.adapter = PagerAdapter(this)
    }


    //First card
    fun onClickMakeAppointment(view: View){
        dialPhoneNumber("+996771030589")
    }
    fun onClickOpenWebpage(view: View) {
        openWebPage("https://www.youtube.com/watch?v=dQw4w9WgXcQ")
    }
    fun onClickEmailMe(view: View){
        composeEmail("alex312s11@gmail.com")
    }
    fun onClickWhatsAppMe(view: View){

    }
    fun onClickSaveToPhonebook(view: View){
        insertContact("Dr. Oleg Mayami")
    }
    public fun onClickFindMeOnTheMap(view: View){
        showMap(Uri.parse("geo:42.87933610064654, 74.61116382833407"))
    }
    public fun onClickTelegram(view: View){
        openWebPage("https://t.me/rin1487")
    }
    public fun onClickText(view: View){
//        composeMmsMessage("hello!", )
    }
    public fun onClickInstagram(view: View){
        openWebPage("https://www.instagram.com/neobis.kg/")
    }
    public fun onClickFacebook(view: View){
        openWebPage("https://www.facebook.com/")
    }
    public fun onClickLinkedIN(view: View){
        openWebPage("https://www.linkedin.com/")
    }

    private fun openWebPage(url: String) {
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        startActivity(intent)
    }

    private fun insertContact(name: String) {
        val intent = Intent(Intent.ACTION_INSERT).apply {
            type = ContactsContract.Contacts.CONTENT_TYPE
            putExtra(ContactsContract.Intents.Insert.NAME, name)
        }
        startActivity(intent)
    }
    private fun composeEmail(addresses: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "*/*"
            putExtra(Intent.EXTRA_EMAIL, addresses)
        }
        startActivity(intent)
    }
    private fun showMap(geoLocation: Uri) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = geoLocation
        }
        startActivity(intent)
    }
    private fun dialPhoneNumber(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phoneNumber")
        }
        startActivity(intent)
    }
}

