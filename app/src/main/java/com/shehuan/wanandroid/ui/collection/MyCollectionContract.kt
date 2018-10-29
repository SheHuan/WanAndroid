package com.shehuan.wanandroid.ui.collection

import com.shehuan.wanandroid.base.BaseView
import com.shehuan.wanandroid.base.net.exception.ResponseException
import com.shehuan.wanandroid.bean.article.ArticleBean

interface MyCollectionContract {
    interface View : BaseView {
        fun onCollectionListSuccess(data: ArticleBean)
        fun onCollectionListError(e: ResponseException)
    }

    interface Presenter {
        fun getCollectionList(pageNum: Int)
    }
}