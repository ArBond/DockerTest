package by.itstep;

import static spark.Spark.*;

public class Server {
    public static void main(String[] args) {
        get("/index", (req, res) -> "Hello World");

        get("/calc", (req, res) -> {
            int a = Integer.parseInt(req.queryParams("a"));
            int b = Integer.parseInt(req.queryParams("b"));
            return String.valueOf(a + b);
        });
    }
}
