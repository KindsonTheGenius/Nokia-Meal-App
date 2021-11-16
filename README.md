# Project Name: Nokia-Meal-App
This is a Nokia Project for the role of DevOps Engineer in Budapest

# Note
I have the configurations, created a cluster but had some challenges getting the web-app communicate with postgres. Since I promise to submit this task today, I'm sending a working solution but you you'll have to run on local docker.
I've included all my configuration files.
If ok by you I could fix the issue and provide and updated version of the task. But for now, I'm submiting what I have. Details are given below.


# Requirements
Docker in needed to run <br />
Since Image would be pulled from Docker hub user should have an account and be logged in to Docker Hub. https://hub.docker.com/

# How to Run
Download/Clone the repository and unzip into a local directory.
Navigate into the directory
Run the command

`
docker-compose up
`

The posgresql maps to port 5432 (so ensure it's not in use) <br />
The bsd-task container maps to port 8080 (so ensure it's not in use)

This command does the following:
- Downloads the image for PostgreSQL
- Spins up a container from the Postgres Image
- Creates the image for the bsd-task application 
- Spins up a container the image
- Create a bridge network for the containers
- Fires up the application and exposes port 8080

After the application starts up, the following routes will be available on http://localhost:8080

`
/api/user
...
...
`

# Notes
The applications starts at port 8080
