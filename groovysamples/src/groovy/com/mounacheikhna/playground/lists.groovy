package com.mounacheikhna.playground

/**
 * Created by cheikhnamouna on 12/28/15.
 */

List.metaClass.transform { operation ->
  operation(delegate);
}


List<String> changes = new ArrayList<>()
changes.add("t1")
changes.add("t2")
changes.add("t3")

println changes
        .collect({ "bla$it"})
        .transform({
          "new$it"
        })

//println changes