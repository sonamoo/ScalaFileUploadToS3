package s3operation

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain

class UploadImagesToS3 extends App {


  val AWSCredentials = new DefaultAWSCredentialsProviderChain().getCredentials
  println(AWSCredentials)




}
