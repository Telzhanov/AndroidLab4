package com.example.askhat.androidlab4.room

import com.example.askhat.androidlab4.entities.Post
import com.example.askhat.androidlab4.entities.User
import io.reactivex.Observable

interface LocalStorage{

    fun addUser(email:String, password:String)

    fun addPost(title:String, content:String)

    fun getUsers(): Observable<List<User>>

    fun getPosts(): Observable<List<Post>>

}