package problems

import scala.io.Source;

object Problem011 {
    def run() = {
        val result = "TODO";
        generate();

        println(s"Problem 011 : ${result}")
    }

    def generate() = {
        val t = Source.fromFile("src/data/problem011.txt")
            .mkString("")
            .split("\n")
            .map(_.split(" "));

        // List of List
        println(t);
    }
}