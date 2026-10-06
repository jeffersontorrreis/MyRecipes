val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    kotlin("jvm") version "2.0.20"
    id("io.ktor.plugin") version "2.3.12"
}

group = "br.com.myrecipes"
version = "1.0.0-SNAPSHOT"

application {
    mainClass.set("br.com.myrecipes.ApplicationKt")
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    // Ktor
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("io.ktor:ktor-server-auth:$ktor_version")
    implementation("io.ktor:ktor-server-auth-jwt:$ktor_version")
    implementation("io.ktor:ktor-server-call-logging:$ktor_version")
    implementation("io.ktor:ktor-server-content-negotiation:$ktor_version")
    implementation("io.ktor:ktor-serialization-gson:$ktor_version")
    implementation("io.ktor:ktor-server-cors:$ktor_version")
    implementation("io.ktor:ktor-server-default-headers:$ktor_version")
    implementation("io.ktor:ktor-server-metrics:$ktor_version")
    implementation("io.ktor:ktor-server-openapi:$ktor_version")
    implementation("io.ktor:ktor-server-swagger:$ktor_version")
    implementation("io.ktor:ktor-server-status-pages:$ktor_version")
    implementation("io.ktor:ktor-server-websockets:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")

    // Dependências externas
    implementation("io.github.g0dkar:qrcode-kotlin:4.1.0")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")
    implementation("io.insert-koin:koin-ktor:3.5.1")
    implementation("org.mongodb:mongodb-driver-kotlin-coroutine:4.11.1")
    implementation("at.favre.lib:bcrypt:0.10.2")

    // Testes
    testImplementation("io.ktor:ktor-server-test-host:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
    testImplementation("app.cash.turbine:turbine:1.1.0")
    testImplementation("io.mockk:mockk:1.13.10")
    testImplementation("com.google.truth:truth:1.4.2")
}