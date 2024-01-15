// ignore_for_file: camel_case_types, prefer_typing_uninitialized_variables
import 'package:faker/faker.dart';
import 'package:flutter/material.dart';

class Chat extends StatelessWidget {
  const Chat({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    Faker fakerData = Faker();
    return Scaffold(
      appBar: AppBar(
        title: const Text(
          "Chat",
          style: TextStyle(color: Colors.black),
        ),
        actions: const [],
        backgroundColor: Colors.white,
      ),
      body: ListView.builder(
        itemCount: 100,
        itemBuilder: (context, index) {
          return ListTile(
            leading: const CircleAvatar(
              child: Icon(Icons.abc),
            ),
            title: Text(fakerData.person.name()),
            subtitle: Text(
              fakerData.lorem.sentence(),
              maxLines: 1,
              overflow: TextOverflow.ellipsis,
            ),
            trailing: const Text(" 10:00 AM "),
          );
        },
      ),
    );
  }
}
