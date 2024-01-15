// ignore_for_file: camel_case_types, prefer_typing_uninitialized_variables

import 'package:uigojek/pages/DashBoard.dart';
import 'package:flutter/material.dart';

class Register extends StatelessWidget {
  const Register({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final MediaQueryWidth = MediaQuery.of(context).size.width;

    return Scaffold(
      body: SingleChildScrollView(
        child: Container(
          padding: const EdgeInsets.all(10.0),
          child: Column(
            children: [
              const SizedBox(
                height: 20.0,
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Image.asset("images/image1.png"),
                  Container(
                    width: 150,
                    height: 30,
                    decoration: BoxDecoration(
                      borderRadius: BorderRadius.circular(20),
                      color: Colors.white,
                      boxShadow: [
                        BoxShadow(
                          color: Colors.grey.withOpacity(0.5),
                          spreadRadius: 2,
                          blurRadius: 7,
                          offset: const Offset(0, 3),
                        ),
                      ],
                    ),
                    child: const Row(
                      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                      children: [
                        Icon(Icons.translate),
                        Text(
                          "Bahasa indonesia",
                          style: TextStyle(
                              fontSize: 13.0, fontWeight: FontWeight.w500),
                        ),
                      ],
                    ),
                  ),
                ],
              ),
              const SizedBox(
                height: 30.0,
              ),
              Container(
                width: MediaQueryWidth * 0.9,
                height: 200,
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Text(
                      "Masukkan nomer HP",
                      style: TextStyle(
                          fontSize: 18.0, fontWeight: FontWeight.bold),
                    ),
                    const SizedBox(
                      height: 10.0,
                    ),
                    Text(
                      "Buat masuk ke akunmu atau daftar kalau kamu baru di Gojek.",
                      style: TextStyle(
                        fontSize: 15.0,
                      ),
                    ),
                    const SizedBox(
                      height: 10.0,
                    ),
                    Row(
                      children: [
                        Text(
                          "Nomer HP",
                          style: TextStyle(
                            fontSize: 15.0,
                          ),
                        ),
                        Text(
                          "*",
                          style: TextStyle(
                              fontSize: 15.0,
                              color: Colors.red,
                              fontWeight: FontWeight.bold),
                        ),
                      ],
                    ),
                    Row(
                      children: [
                        Container(
                            width: 60,
                            height: 30,
                            decoration: BoxDecoration(
                              color: Color.fromARGB(255, 218, 216, 216),
                              borderRadius: BorderRadius.circular(20),
                            ),
                            child: Center(
                                child: Text(
                              "+62",
                              style: TextStyle(fontWeight: FontWeight.w500),
                            ))),
                        Container(
                          margin: const EdgeInsets.only(left: 20),
                          width: 250,
                          height: 50,
                          child: const TextField(
                            decoration: InputDecoration(
                              hintText: "123456789",
                            ),
                            showCursor: true,
                          ),
                        ),
                      ],
                    )
                  ],
                ),
              ),
              const SizedBox(
                height: 350.0,
              ),
              Container(
                width: MediaQueryWidth * 0.9,
                height: 50,
                decoration: BoxDecoration(
                    color: Colors.green,
                    borderRadius: BorderRadius.circular(20)),
                child: Material(
                  color: Colors.transparent,
                  child: InkWell(
                    borderRadius: BorderRadius.circular(20),
                    onTap: () {
                      Navigator.of(context).pushReplacement(
                        MaterialPageRoute(
                          builder: (_) => DashBoard(),
                        ),
                      );
                    },
                    child: Center(
                      child: Text(
                        "LANJUT",
                        textAlign: TextAlign.center,
                        style: TextStyle(
                            fontWeight: FontWeight.bold, color: Colors.white),
                      ),
                    ),
                  ),
                ),
              ),
              const SizedBox(
                height: 50.0,
              ),
              Text(
                "Dengan masuk atau mendaftar, kamu menyetujui Ketentuan layanan dan Kebijakan privasi.",
                style: TextStyle(fontSize: 13.0, fontWeight: FontWeight.w400),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
