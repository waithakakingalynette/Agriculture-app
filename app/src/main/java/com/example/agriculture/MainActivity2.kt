package com.example.agriculture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.agriculture.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayProducts()
        binding.btnnextt.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }
        binding.rvproducts.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }
    }

    fun displayProducts(){
        val product=ProductData("Cabbage",70.0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnU9h5tDPKGOeYjTjlEvHTN89uy141dDSCNA&usqp=CAU")
        val product1=ProductData("Apple",70.0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnHw4li_mqJPuvZqxHVR2s-SXP5jIwZb272Q&usqp=CAU")
        val product2=ProductData("Onions",70.0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHJVLtdbpKSAj_-lmTkWaXjbBABjedG0PCjr_OgnuTL245RQjAylh-Fq8l8AezhCqOeIc&usqp=CAU")
        val product3=ProductData("Potatoes",70.0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRuQeWjGYWV6eTrHzSpLWsZt4biFDl67gwl0A&usqp=CAU")
        val product4=ProductData("Carrots",70.0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKhHgqUbnCFwwBOp_0kIBH7_wqvg273unVaw&usqp=CAU")
        val product5=ProductData("Lettuce",70.0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQgYwVjM_mSHQHc9TFOui8akS3NZ94LpEtBqA&usqp=CAU")
        val product6=ProductData("Oranges",70.0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQcBQreIXA9Lt0TJ8Zj9IfaEdjSl6aIRJWLkw&usqp=CAU")
        val product7=ProductData("Maize",70.0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQI2w1pTegcUPRUE_OGZjGLmZNfAmVJ6fehXA&usqp=CAU")
        val product8=ProductData("Beans",70.0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWIYIVlR9Q-ZSiREYjgiIPHcW3szUPcHJFJQ&usqp=CAU")
        val product9=ProductData("Pears",70.0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQt3j_c3gxSFgr7kj8oZUc79RrfjfPijBQs0vuNew1XKC4bsDXmXvFbbP4bfsQBj695o7w&usqp=CAU")
        val product10=ProductData("Arrow roots",70.0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzUEf6nuofbRfRVDs4IJeQxw0dx1jMan_F5g&usqp=CAU")
        val product11=ProductData("Sweet potatoes",70.0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuT4H8ViFJICv5TYDDv8ftkv0JdyfGCFfhzAqVnMNH25iYuZOFgshO-bDgl88AXFV0-yg&usqp=CAU")

        val productsList= mutableListOf(product,product1,product2,product3,product4,product5,product6,product7,product8,product9,product10,product11)
        val contactRvAdapter=ProductRvAdapter(productsList)
        binding.rvproducts.layoutManager= LinearLayoutManager(this)
        binding.rvproducts.adapter=contactRvAdapter


    }

}