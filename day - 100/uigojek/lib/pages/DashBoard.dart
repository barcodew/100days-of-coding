// ignore_for_file: camel_case_types, prefer_typing_uninitialized_variables


import 'package:flutter/material.dart';
import 'package:uigojek/pages/TabMenu/Beranda.dart';
import 'package:uigojek/pages/TabMenu/Chat.dart';
import 'package:uigojek/pages/TabMenu/Pesanan.dart';
import 'package:uigojek/pages/TabMenu/Promo.dart';

class DashBoard extends StatefulWidget {
  DashBoard({Key? key}) : super(key: key);

  @override
  State<DashBoard> createState() => _DashBoardState();
}

class _DashBoardState extends State<DashBoard> {
  @override
  Widget build(BuildContext context) {
    return const DefaultTabController(
      length: 4,
      child: Scaffold(
        body: TabBarView(
          children: [Beranda(), Promo(), Pesanan(), Chat()],
        ),
        bottomNavigationBar: TabBar(
          tabs: [
            Tab(
              text: "Beranda",
              icon: Icon(Icons.home),
            ),
            Tab(
              text: "Promo",
              icon: Icon(Icons.percent),
            ),
            Tab(
              text: "Pesanan",
              icon: Icon(Icons.online_prediction_outlined),
            ),
            Tab(
              text: "Chat",
              icon: Icon(Icons.chat_bubble),
            ),
          ],
          indicator: BoxDecoration(
            color: Color.fromARGB(255, 217, 245, 218),
            border: Border(
              top: BorderSide(
                color: Colors.green,
                width: 5
              ),
            ),
          ),
          unselectedLabelColor: Colors.black,
          labelColor: Colors.green,
        ),
      ),
    );
  }
}
