// ignore_for_file: camel_case_types, prefer_typing_uninitialized_variables

import 'package:flutter/material.dart';

class Profile extends StatelessWidget {
  const Profile({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final MediaQueryWidth = MediaQuery.of(context).size.width;

    return Scaffold(
      appBar: AppBar(
        title: const Text(
          "Profile",
          style: TextStyle(color: Colors.black),
        ),
        actions: const [],
        iconTheme: IconThemeData(color: Colors.black),
        backgroundColor: Colors.white,
      ),
      body: SingleChildScrollView(
        child: Container(
          padding: const EdgeInsets.all(20.0),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Container(
                padding: EdgeInsets.all(10),
                width: MediaQueryWidth * 0.90,
                height: 100,
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.spaceAround,
                  children: [
                    Container(
                      width: 50,
                      height: 50,
                      decoration: BoxDecoration(
                          color: Colors.green,
                          borderRadius: BorderRadius.circular(50)),
                      child: Image.asset('images/users-profile.png'),
                    ),
                    Container(
                      padding: EdgeInsets.all(5),
                      margin: EdgeInsets.only(right: 70),
                      child: Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          Text(
                            "Yourname",
                            style: TextStyle(
                                fontSize: 18.0, fontWeight: FontWeight.bold),
                          ),
                          Text(
                            "yourmail@example.com",
                            style: TextStyle(
                              fontSize: 15.0,
                            ),
                          ),
                          Text(
                            "+62123456789",
                            style: TextStyle(
                              fontSize: 15.0,
                            ),
                          ),
                        ],
                      ),
                    ),
                    IconButton(onPressed: () {}, icon: Icon(Icons.edit))
                  ],
                ),
              ),
              const SizedBox(
                height: 20.0,
              ),
              Text("Akun"),
              Container(
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.start,
                  children: [
                    Row(
                      children: [
                        const Icon(Icons.approval_rounded),
                        Container(
                          width: 280,
                          height: 40,
                          padding: const EdgeInsets.all(10),
                          decoration: const BoxDecoration(
                            border: Border(
                              bottom: BorderSide(
                                  color: Color.fromARGB(255, 128, 127, 127),
                                  width: 2.0),
                            ),
                          ),
                          child: const Text("Pesanan"),
                        ),
                        const Icon(Icons.arrow_right_sharp)
                      ],
                    ),
                    Row(
                      children: [
                        const Icon(Icons.calendar_month),
                        Container(
                          width: 280,
                          height: 40,
                          padding: const EdgeInsets.all(10),
                          decoration: const BoxDecoration(
                              border: Border(
                                  bottom: BorderSide(
                                      color: Color.fromARGB(255, 128, 127, 127),
                                      width: 2.0))),
                          child: const Text("Langgananku"),
                        ),
                        const Icon(Icons.arrow_right_sharp)
                      ],
                    ),
                    Row(
                      children: [
                        const Icon(Icons.percent_outlined),
                        Container(
                          width: 280,
                          height: 40,
                          padding: const EdgeInsets.all(10),
                          decoration: const BoxDecoration(
                              border: Border(
                                  bottom: BorderSide(
                                      color: Color.fromARGB(255, 128, 127, 127),
                                      width: 2.0))),
                          child: const Text("Promo"),
                        ),
                        const Icon(Icons.arrow_right_sharp)
                      ],
                    ),
                    Row(
                      children: [
                        const Icon(Icons.credit_card),
                        Container(
                          width: 280,
                          height: 40,
                          padding: const EdgeInsets.all(10),
                          decoration: const BoxDecoration(
                              border: Border(
                                  bottom: BorderSide(
                                      color: Color.fromARGB(255, 128, 127, 127),
                                      width: 2.0))),
                          child: const Text("Cara Pembayaran"),
                        ),
                        const Icon(Icons.arrow_right_sharp)
                      ],
                    ),
                    Row(
                      children: [
                        const Icon(Icons.support),
                        Container(
                          width: 280,
                          height: 40,
                          padding: const EdgeInsets.all(10),
                          decoration: const BoxDecoration(
                              border: Border(
                                  bottom: BorderSide(
                                      color: Color.fromARGB(255, 128, 127, 127),
                                      width: 2.0))),
                          child: const Text("Bantuan & Laporan Saya"),
                        ),
                        const Icon(Icons.arrow_right_sharp)
                      ],
                    ),
                    Row(
                      children: [
                        const Icon(Icons.business),
                        Container(
                          width: 280,
                          height: 40,
                          padding: const EdgeInsets.all(10),
                          decoration: const BoxDecoration(
                              border: Border(
                                  bottom: BorderSide(
                                      color: Color.fromARGB(255, 128, 127, 127),
                                      width: 2.0))),
                          child: const Text("Profil Bisnis"),
                        ),
                        const Icon(Icons.arrow_right_sharp)
                      ],
                    ),
                    Row(
                      children: [
                        const Icon(Icons.translate),
                        Container(
                          width: 280,
                          height: 40,
                          padding: const EdgeInsets.all(10),
                          decoration: const BoxDecoration(
                              border: Border(
                                  bottom: BorderSide(
                                      color: Color.fromARGB(255, 128, 127, 127),
                                      width: 2.0))),
                          child: const Text("Pilih Bahasa"),
                        ),
                        const Icon(Icons.arrow_right_sharp)
                      ],
                    ),
                    Row(
                      children: [
                        const Icon(Icons.bookmark),
                        Container(
                          width: 280,
                          height: 40,
                          padding: const EdgeInsets.all(10),
                          decoration: const BoxDecoration(
                              border: Border(
                                  bottom: BorderSide(
                                      color: Color.fromARGB(255, 128, 127, 127),
                                      width: 2.0))),
                          child: const Text("Alamat Favorit"),
                        ),
                        const Icon(Icons.arrow_right_sharp)
                      ],
                    ),
                    Row(
                      children: [
                        const Icon(Icons.person_2),
                        Container(
                          width: 280,
                          height: 40,
                          padding: const EdgeInsets.all(10),
                          decoration: const BoxDecoration(
                              border: Border(
                                  bottom: BorderSide(
                                      color: Color.fromARGB(255, 128, 127, 127),
                                      width: 2.0))),
                          child: const Text("Ajak Teman Pakai Gojek"),
                        ),
                        const Icon(Icons.arrow_right_sharp)
                      ],
                    ),
                    Row(
                      children: [
                        const Icon(Icons.notifications),
                        Container(
                          width: 280,
                          height: 40,
                          padding: const EdgeInsets.all(10),
                          decoration: const BoxDecoration(
                              border: Border(
                                  bottom: BorderSide(
                                      color: Color.fromARGB(255, 128, 127, 127),
                                      width: 2.0))),
                          child: const Text("Notifikasi"),
                        ),
                        const Icon(Icons.arrow_right_sharp)
                      ],
                    ),
                    Row(
                      children: [
                        const Icon(Icons.security),
                        Container(
                          width: 280,
                          height: 40,
                          padding: const EdgeInsets.all(10),
                          decoration: const BoxDecoration(
                              border: Border(
                                  bottom: BorderSide(
                                      color: Color.fromARGB(255, 128, 127, 127),
                                      width: 2.0))),
                          child: const Text("Keamanan Akun"),
                        ),
                        const Icon(Icons.arrow_right_sharp)
                      ],
                    ),
                    Row(
                      children: [
                        const Icon(Icons.settings),
                        Container(
                          width: 280,
                          height: 40,
                          padding: const EdgeInsets.all(10),
                          decoration: const BoxDecoration(
                              border: Border(
                                  bottom: BorderSide(
                                      color: Color.fromARGB(255, 128, 127, 127),
                                      width: 2.0))),
                          child: const Text("Pengaturan Akun"),
                        ),
                        const Icon(Icons.arrow_right_sharp)
                      ],
                    ),
                  ],
                ),
              )
            ],
          ),
        ),
      ),
    );
  }
}
