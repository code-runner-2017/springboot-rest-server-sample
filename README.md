# springboot-rest-server-sample
Example of minimalistic REST service with SpringBoot

Run with docker:

    docker run --rm -v "$PWD":/home/gradle/project -w /home/gradle/project -p 8080:8080 gradle gradle bootRun
    
Check that is works:

    curl "http://localhost:8080/hello"
    
To deploy with Docker just the jar file:

    docker build -t dylandog/springboot-rest-sample .
    docker run -d -p 8080:8080 dylandog/springboot-rest-sample
    
