package com.chirikualii.materidb.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movie")
data class MovieEntity (
    @PrimaryKey
    val movieId :String,

    @ColumnInfo(name = "title")
    val title:String,

    @ColumnInfo(name = "releaseDate")
    val releaseDate:String,

    @ColumnInfo(name = "image_poster")
    val imagePoster:String,

    @ColumnInfo(name = "backdrop")
    val backdrop:String,

    @ColumnInfo(name = "overview")
    val overview:String,

    @ColumnInfo(name = "type_movie")
    val typeMovie:String
        )
