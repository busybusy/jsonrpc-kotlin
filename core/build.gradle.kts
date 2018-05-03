plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))

    implementation(group = "com.squareup.okio", name = "okio", version = "1.14.1")
    implementation(group = "com.squareup.moshi", name = "moshi-kotlin", version = "1.5.0")
}

dependencies {
    val junitVersion = "5.2.0"
    testImplementation(group = "org.junit.jupiter", name = "junit-jupiter-api", version = junitVersion)
    testRuntimeOnly(group = "org.junit.jupiter", name = "junit-jupiter-engine", version = junitVersion)
}

tasks.withType(Test::class.java) {
    useJUnitPlatform()
}