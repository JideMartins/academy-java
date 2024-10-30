-- Get all the courses
SELECT "courseId", "courseName" FROM "courses";

-- Get all the students
SELECT "studentId", "courseId", "studentName", "studentEmail", "studentPhone" FROM "students";

-- Get all the students who have a courseId = 1
SELECT *
FROM students
WHERE "courseId" = 1;

-- Get all the students whose studentId is greater than 4 but less than 20
SELECT * 
FROM students
WHERE "studentId" > 4 AND "studentId" < 20;

-- Get all the students who do not have data stored for studentPhone
SELECT *
FROM students
WHERE "studentPhone" is NULL;

-- Get all the students whose studentName starts with Jo no matter what other letters might follow the Jo
SELECT * FROM "students" WHERE "studentName" LIKE 'Jo%';

-- Get all the students whose courseId is present in the list (1, 5)
SELECT * FROM "students" WHERE "courseId" IN ( 1, 5 );

-- Get all the students whose courseIds are between 1 AND 5 inclusive
SELECT * FROM "students" WHERE "courseId" BETWEEN 1 AND 5;

SELECT * 
FROM "students" 
WHERE "studentId" BETWEEN 5 AND 19;


INSERT INTO "courses" ("courseName")
VALUES ('Quantum Computing');

SELECT * FROM courses;

INSERT INTO students ("courseId", "studentName", "studentEmail", "studentPhone")
VALUES (1, 'John Doe', 'john@doe.com', '4586272890');

--Update name of the student that has studentId = 1 to 'Alex' 
UPDATE students 
SET "studentName" = 'Alex' 
WHERE "studentId" = 1;

-- Update studentPhone to 18273124 where studentId = 1 and studentName = 'Alex' 
UPDATE students 
SET "studentPhone" = '4182731248' 
WHERE "studentName" = 'Sophia Brown';

-- Update studentPhone to NULL where studentId greater-than 10 and less-than 12
UPDATE students 
SET "studentPhone" = NULL 
WHERE "studentId" > 10 AND "studentId" < 12;

