package com.mounacheikhna.screenshots.frame

import org.gradle.api.NamedDomainObjectContainer
/**
 * Created by cheikhnamouna on 1/25/16.
 */
class DemoExtension {

  NamedDomainObjectContainer<Book> books

  class Book {
    String name
    int pages
  }

}
