import 'package:flutter/material.dart';

// ignore: must_be_immutable
class PromoMenu extends StatelessWidget {
  String Judul, teks1, teks2, teksBesar;

  PromoMenu(
      {required this.Judul,
      required this.teks1,
      required this.teks2,
      required this.teksBesar});

  @override
  Widget build(BuildContext context) {
    return  Container(
      margin: EdgeInsets.only(left: 5),
      width: 150,
      height: 180,
      decoration: BoxDecoration(
          color: Colors.white,
          borderRadius: BorderRadius.vertical(top: Radius.circular(20))),
      child: Stack(
        children: [
          Container(
            width: 150,
            height: 140,
            decoration: const BoxDecoration(
              color: Color.fromARGB(255, 172, 23, 12),
              borderRadius: BorderRadius.vertical(
                top: Radius.circular(20),
              ),
            ),
            child: Center(
              child: Container(
                width: 120,
                height: 120,
                decoration: BoxDecoration(
                    color: Color.fromARGB(255, 212, 17, 3),
                    borderRadius: BorderRadius.circular(20)),
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.center,
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Text(
                      teks1,
                      style: const TextStyle(
                          fontWeight: FontWeight.w500,
                          color: Colors.white,
                          fontSize: 12),
                    ),
                    Text(
                      teks2,
                      style: const TextStyle(
                          fontWeight: FontWeight.w500,
                          color: Colors.white,
                          fontSize: 12),
                    ),
                    Text(
                      teksBesar,
                      style: const TextStyle(
                          fontWeight: FontWeight.w500,
                          color: Colors.white,
                          fontSize: 30),
                    ),
                  ],
                ),
              ),
            ),
          ),
          Align(
            alignment: Alignment.bottomLeft,
            child: Container(
              padding: EdgeInsets.all(10),
              width: 120,
              child: Text(
                Judul,
                style: TextStyle(fontSize: 12, fontWeight: FontWeight.bold),
              ),
            ),
          ),
        ],
      ),
    );
  }
}
