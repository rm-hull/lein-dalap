{["test/fixtures/file.clj" "test/fixtures/out.cljs"] [(dalap/when (fn* [p1__1240#] (= (count (str p1__1240#)) 2))) (dalap/transform (fn [form w] (when (#{(quote is) (quote ns)} form) (throw (Exception. (str "form `" form "' received"))))))]}