package com.example.askhat.androidlab4.post

import com.example.askhat.androidlab4.entities.Post
import com.example.askhat.androidlab4.room.LocalStorage
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PostRepository(private val localStorage:LocalStorage): PostContract.PostRepository{
    override fun getPosts(): Observable<ArrayList<Post>> {
        return localStorage.getPosts()
                .map{
                    it as ArrayList<Post>
                }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }

}