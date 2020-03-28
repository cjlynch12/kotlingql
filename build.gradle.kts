import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.2.5.RELEASE"
	id("io.spring.dependency-management") version "1.0.9.RELEASE"
	kotlin("jvm") version "1.3.61"
	kotlin("plugin.spring") version "1.3.61"
}

group = "com.clynch"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
	mavenCentral()
	jcenter()
}

dependencies {
	implementation("com.expediagroup:graphql-kotlin-spring-server:2.0.0.RC3")
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.jetbrains.exposed:exposed-core:0.22.1")
	implementation("org.jetbrains.exposed:exposed-dao:0.22.1")
	implementation("org.jetbrains.exposed:exposed-jdbc:0.22.1")
	implementation("org.jetbrains.exposed:exposed-java-time:0.22.1")
	implementation("org.jetbrains.exposed:spring-transaction:0.22.1")
	implementation("org.flywaydb:flyway-core:6.3.2")

	implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.2.5.RELEASE")

	implementation("org.postgresql:postgresql")

	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}
