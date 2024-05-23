# ShapeProject

ShapeProject is a Java library for calculating properties of various geometric shapes, including triangles and quadrangles. It provides classes and methods to compute the perimeter, area, and radii of inscribed and circumscribed circles for different types of shapes.

## Features

- **Triangles:**
  - EquilateralTriangle
  - IsoscelesTriangle
  - ScaleneTriangle
  - RightTriangle

- **Quadrangles:**
  - Square
  - Rectangle
  - Parallelogram
  - Rhombus

## Installation

To use this library, you need to include it in your project as a dependency. If you are using Maven, add the following to your `pom.xml`:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>ShapeProject</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <!-- JUnit dependency for testing -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.7.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.7.1</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <sourceDirectory>src/main/java</sourceDirectory>
        <testSourceDirectory>src/test/java</testSourceDirectory>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
