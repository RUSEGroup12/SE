from flask import Flask, jsonify, render_template, request, redirect, url_for, abort, session
app = Flask(__name__)
app.config['SECRET_KEY'] = 'test';

temp = {'current':'73','preferred':'73'}

@app.route('/', methods=['GET'])
def home():
    return render_template('index.html')

@app.route('/login', methods=['POST'])
def login():
	session['username'] = request.form['username']
	session['password'] = request.form['password']
	return redirect(url_for('dashboard'))

@app.route('/dashboard')
def dashboard():
	if not 'username' in session:
		return abort(403)
	return render_template('dash.html',username=session['username'])

@app.route('/energy')
def energy():
	if not 'username' in session:
		return abort(403)
	return render_template('energy.html',username=session['username'],preferred=temp['preferred'],current=temp['current'])

@app.route('/updateTemp', methods=['POST'])
def updateTemp():
	temp['preferred'] = request.form['preferred']
	return redirect(url_for('energy'))

@app.route('/api',methods=['GET'])
def test():
	return jsonify({'message from SHS' : 'working!'})

@app.route('/api/temp', methods=['GET'])
def returnAll():
	return jsonify(temp)

@app.route('/api/temp/current',methods=['POST'])
def currentF():
	temp['current'] = request.form['current']
	return jsonify(temp)

@app.route('/api/temp/preferred',methods=['POST'])
def preferredF():
	temp['preferred'] = request.form['preferred']
	return jsonify(temp)

if __name__ == '__main__':
    app.run(debug=True)