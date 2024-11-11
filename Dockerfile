FROM adoptopenjdk/openjdk11
  
EXPOSE 8081
 
ENV SpringMvcUser /target/

COPY target/*.war $SpringMvcUser/SpringMvcUser.war

WORKDIR $SpringMvcUser

CMD ["java", "-war", "SpringMvcUser.war"]