Action pressedAction = new AbstractAction() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("YEEEEET");
				}
			};
			this.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "pressed");
			this.getActionMap().put("pressed", pressedAction);
