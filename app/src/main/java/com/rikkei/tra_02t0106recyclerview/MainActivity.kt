package com.rikkei.tra_02t0106recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.*
import android.widget.Toast
import com.rikkei.tra_02t0106recyclerview.adapter.PeopleAdapter
import com.rikkei.tra_02t0106recyclerview.model.People
import java.text.FieldPosition
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),PeopleAdapter.PeopleOnclickListener {

    private var peopleAdapter: PeopleAdapter? = null
    private var peopleList = mutableListOf<People>()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun  init(){
        peopleAdapter = PeopleAdapter()
        peopleList.add(People("b14dccn155","Vu Quoc Trong",23))
        peopleList.add(People("b14dccn329","Hoang anh",20))
        peopleList.add(People("b14dccn030","Hữu Thăng",17))
        peopleList.add(People("b14dccn166","Vu Dinh Nguyen",26))
        peopleList.add(People("b14dccn195","Vu Dinh Vu",30))
        peopleList.add(People("b14dccn134","Vu Quoc Trong",23))
        peopleList.add(People("b14dccn155","Vu Quoc Trong",23))
        peopleList.add(People("b14dccn329","Hoang anh",20))
        peopleList.add(People("b14dccn030","Hữu Thăng",17))
        peopleList.add(People("b14dccn166","Vu Dinh Nguyen",26))
        peopleList.add(People("b14dccn195","Vu Dinh Vu",30))
        peopleList.add(People("b14dccn134","Vu Quoc Trong",23))
        peopleList.add(People("b14dccn155","Vu Quoc Trong",23))
        peopleList.add(People("b14dccn329","Hoang anh",20))
        peopleList.add(People("b14dccn030","Hữu Thăng",17))
        peopleList.add(People("b14dccn166","Vu Dinh Nguyen",26))
        peopleList.add(People("b14dccn195","Vu Dinh Vu",30))
        peopleList.add(People("b14dccn134","Vu Quoc Trong",23))

        peopleList.add(People("b14dccn155","Vu Quoc Trong",23))
        peopleList.add(People("b14dccn329","Hoang anh",20))
        peopleList.add(People("b14dccn030","Hữu Thăng",17))
        peopleList.add(People("b14dccn166","Vu Dinh Nguyen",26))
        peopleList.add(People("b14dccn195","Vu Dinh Vu",30))
        peopleList.add(People("b14dccn134","Vu Quoc Trong",23))
        peopleList.add(People("b14dccn155","Vu Quoc Trong",23))
        peopleList.add(People("b14dccn329","Hoang anh",20))
        peopleList.add(People("b14dccn030","Hữu Thăng",17))
        peopleList.add(People("b14dccn166","Vu Dinh Nguyen",26))
        peopleList.add(People("b14dccn195","Vu Dinh Vu",30))
        peopleList.add(People("b14dccn134","Vu Quoc Trong",23))
        peopleList.add(People("b14dccn155","Vu Quoc Trong",23))
        peopleList.add(People("b14dccn329","Hoang anh",20))
        peopleList.add(People("b14dccn030","Hữu Thăng",17))
        peopleList.add(People("b14dccn166","Vu Dinh Nguyen",26))
        peopleList.add(People("b14dccn195","Vu Dinh Vu",30))
        peopleList.add(People("b14dccn134","Vu Quoc Trong",23))



        peopleAdapter?.setListPeople(peopleList)
        peopleAdapter?.setPeopleOnclickListener(this)
        val mLayoutManager = LinearLayoutManager(applicationContext)
        val mGridLayoutManager = GridLayoutManager(this,2)
        val staggeredGridLayoutManager = StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL)
        recyclerView?.apply {
            layoutManager = staggeredGridLayoutManager
            itemAnimator = DefaultItemAnimator()
            adapter = peopleAdapter
        }

    }

    override fun onClickItem(position: Int) {
        Toast.makeText(this,"Tên Là: "+ peopleList[position].name,Toast.LENGTH_SHORT).show()
    }
}
