# compojure-api

A template for creating APIs using Compojure. It's *Heroku-ready*.

## Usage

```
lein new compojure-api foo
cd foo
lein ring server-headless
```

Then, check if it works using `curl`.

```
curl localhost:3000
{"message":"Hello, World"}
```

## License

Copyright © 2014 Zaiste

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
