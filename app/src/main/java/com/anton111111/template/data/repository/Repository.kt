package com.anton111111.template.data.repository

import com.anton111111.template.data.source.local.LocalDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(
    private val local: LocalDataSource
) {


}