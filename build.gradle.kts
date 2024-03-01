plugins {
    `java-library`
}

group = "com.github.melchisedek"
version = "5.3.32"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-aop:6.1.3")
    implementation("org.springframework:spring-beans:6.1.3")
    implementation("org.springframework:spring-core:6.1.3")
    implementation("org.springframework:spring-context:6.1.3")
    implementation("org.springframework:spring-expression:6.1.3")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
}
