# LiftLearn
A web app built using Lift framework and other stack ( Angular Js, Bootstrap, Less).

#### How to run ?
```java
Sumits-MacBook-Air:Documents sumit$ cd LiftLearn
Sumits-MacBook-Air:LiftLearn sumit$ sbt
> jetty:start
//It will start srever on 8080 port
```
#### Notes from Lift CookBook by David Pollak
* The Boot class is run when starting your application, and it’s where you can configure the behaviour of Lift.
* ```xsbt-web-plugin``` plugin will allow you to start and stop your application.
* The web.xml file tells web containers, such as Jetty as configured by xsbt-web-plugin, to pass all requests on to Lift.
```
- project root directory
  | build.sbt
  - project/
    | plugins.sbt
  - src/
    - main/
      - scala/
        - bootstrap/
          | Boot.scala
        - org/
          - yourorganization/
            - liftfromscratch/
              | &lt;your Scala code goes here&gt;
      - webapp/
        | index.html
        | &lt;any other web resources - images, HTML, JavaScript, etc - go here&gt;
        - WEB-INF/
          | web.xml
    - test/
      - scala/
        - org/
          - yourorganization/
            - liftfromscratch/
              | &lt;your tests go here&gt;
```
* Compile And Reload Browser
```
~; jetty:start; jetty:reload /

```