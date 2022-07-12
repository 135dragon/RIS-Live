# RIS-Live
CSCI3300 Summer 2022 Radiology Information System project

Check out: https://github.com/coopman611/project for the demo version (easy install, local database)

# Using
1. Save https://cockroachlabs.cloud/clusters/785e2baa-b9dd-44d1-82b4-f9f2354d6570/cert as `root.crt` in the `RIS-Live` directory, replacing the one you're currently using.
2. Delete `credentials.ris` from the top-level directory if it exists.
3. Log into the RIS application, entering the URL `jdbc:postgresql://free-tier14.aws-us-east-1.cockroachlabs.cloud:26257/defaultdb?options=--cluster%3Dgamma-hamster-3427&password=kaTcN_k9iIpc0vr0a4GU8A&sslmode=verify-full&user=risUser` when prompted.

