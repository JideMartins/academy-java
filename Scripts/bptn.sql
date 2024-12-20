CREATE TABLE "courses"(
   "courseId" INT GENERATED ALWAYS AS IDENTITY,
   "courseName" VARCHAR(120) NOT NULL,
    CONSTRAINT "courses_pk" PRIMARY KEY ("courseId")
);

CREATE TABLE "students" (
  "studentId" INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  "courseId" INT NOT NULL,
  "studentName" VARCHAR(120) NOT NULL,
  "studentEmail" VARCHAR(120) UNIQUE NOT NULL,
  "studentPhone" VARCHAR(20),
  FOREIGN KEY ("courseId") 
    REFERENCES courses("courseId")
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID
);
