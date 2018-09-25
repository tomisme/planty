void setup() {
  Serial.begin(9600);
}

void loop() {
  int sensorValue = analogRead(A0);
  Serial.print("Moistness: ");
  Serial.print(sensorValue);
  Serial.print("\n");
  delay(1000);
}
