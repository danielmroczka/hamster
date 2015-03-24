# hamster
Pure read-only implementation of hibernate 2nd level cache (project in an early stage of software development)

[![Build Status](https://travis-ci.org/danielmroczka/hamster.png?branch=master)](https://travis-ci.org/danielmroczka/hamster)
[![Coverage Status](https://coveralls.io/repos/danielmroczka/hamster/badge.png?branch=master)](https://coveralls.io/r/danielmroczka/hamster?branch=master)

Pure Hibernate 2nd level cache using HashMap. 

## Features

* Implement "read-only" strategies 

## Build

To build:

```
$ git clone https://github.com/danielmroczka/hamster.git
$ cd hamster
$ mvn install
```

## Usage
Maven:

```xml
<dependency>
    <groupId>com.labs.dm</groupId>
    <artifactId>hamster-cache</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

Hibernate configuration

```xml
<property name="hibernate.cache.region.factory_class">com.labs.dm.hamster.cache.HamsterRegionFactory</property>
<property name="com.labs.dm.hamster.configurationResourceName">/hamster.xml</property>
```
