git config --global user.name "20201030KiHun"
git config --global user.email nejju@unist.ac.kr

git clone https://github.com/20201030KiHun/MovieProject.git
cd MovieProject
git checkout milestone2

mvn package

java -jar target/project-0.0.1-SNAPSHOT.jar