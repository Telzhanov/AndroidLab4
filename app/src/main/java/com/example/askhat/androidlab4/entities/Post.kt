package com.example.askhat.androidlab4.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "post_table")
data class Post(
        @ColumnInfo(name = "title") var title:String,
        @ColumnInfo(name = "content") var content:String):Serializable{
    @PrimaryKey(autoGenerate = true)  var id:Int ?=null
    @Ignore constructor(id:Int, title:String, content:String):this(title,content){
        this.id = id
    }
}