# guestbook

TODO: STATUS (AND KOANS TOO, and flashback too)

This is the first exercise of the book:

Web Development with Clojure - by Dmitri Sotnikov

[Link](https://pragprog.com/book/dswdcloj/web-development-with-clojure)

## Prerequisites

* You will need [Leiningen][1] 1.7.0 or above installed.
* [Clojure][2] 1.6


[1]: https://github.com/technomancy/leiningen
[2]: http://clojure.org

## Running

To start a web server for the application, run:

    lein ring server

From LightTable:

* View Connections - Clojure - project.clj
* CTRL+SPACE - Open Clojure Instarepl


    ; run the server
    (use 'guestbook.repl)
    (start-server)

    ; create the db
    (use 'guestbook.models.db)
    (create-guestbook-table)


## License

See [LICENSE](LICENSE)
